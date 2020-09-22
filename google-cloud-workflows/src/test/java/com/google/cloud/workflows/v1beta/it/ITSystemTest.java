/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.workflows.v1beta.it;

import static org.junit.Assert.assertEquals;

import com.google.cloud.ServiceOptions;
import com.google.cloud.workflows.v1beta.CreateWorkflowRequest;
import com.google.cloud.workflows.v1beta.DeleteWorkflowRequest;
import com.google.cloud.workflows.v1beta.ListWorkflowsRequest;
import com.google.cloud.workflows.v1beta.LocationName;
import com.google.cloud.workflows.v1beta.UpdateWorkflowRequest;
import com.google.cloud.workflows.v1beta.Workflow;
import com.google.cloud.workflows.v1beta.WorkflowName;
import com.google.cloud.workflows.v1beta.WorkflowsClient;
import com.google.protobuf.FieldMask;
import com.google.protobuf.util.FieldMaskUtil;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ITSystemTest {

  private static final String PROJECT_ID = ServiceOptions.getDefaultProjectId();
  private static final String LOCATION = "us-central1";
  private static final String ID = UUID.randomUUID().toString().substring(0, 8);
  private static final String WORKFLOW_ID = "test-workflow-id-" + ID;
  private static final String PARENT = LocationName.of(PROJECT_ID, LOCATION).toString();
  private static final String WORKFLOW_NAME =
      WorkflowName.of(PROJECT_ID, LOCATION, WORKFLOW_ID).toString();
  private static final String WORKFLOW_DESCRIPTION = "workflow-test-description";
  private static final String SOURCE_CONTENT =
      "   # This is a sample workflow, feel free to replace it with your source code  "
          + "   #  "
          + "   # This workflow does the following:  "
          + "   # - reads current time and date information from an external API and stores  "
          + "   #   the response in CurrentDateTime variable  "
          + "   # - retrieves a list of Wikipedia articles related to the day of the week  "
          + "   #   from CurrentDateTime  "
          + "   # - returns the list of articles as an output of the workflow  "
          + "     "
          + "   - getCurrentTime:  "
          + "       call: http.get  "
          + "       args:  "
          + "           url: https://us-central1-workflowsample.cloudfunctions.net/datetime  "
          + "       result: CurrentDateTime  "
          + "   - readWikipedia:  "
          + "       call: http.get  "
          + "       args:  "
          + "           url: https://en.wikipedia.org/w/api.php  "
          + "           query:  "
          + "               action: opensearch  "
          + "               search: ${CurrentDateTime.body.dayOfTheWeek}  "
          + "       result: WikiResult  "
          + "   - returnOutput:  "
          + "      return: ${WikiResult.body[1]}  ";
  private static WorkflowsClient client;
  private static Workflow expectedWorkflow;

  @BeforeClass
  public static void setUp() throws IOException, ExecutionException, InterruptedException {
    // Create Test Workflow
    client = WorkflowsClient.create();
    Workflow workflow =
        Workflow.newBuilder().setName(WORKFLOW_NAME).setSourceContents(SOURCE_CONTENT).build();
    CreateWorkflowRequest request =
        CreateWorkflowRequest.newBuilder()
            .setParent(PARENT)
            .setWorkflow(workflow)
            .setWorkflowId(WORKFLOW_ID)
            .build();
    expectedWorkflow = client.createWorkflowAsync(request).get();
  }

  @AfterClass
  public static void tearDown() {
    // Delete Test Worflow
    DeleteWorkflowRequest deleteRequest =
        DeleteWorkflowRequest.newBuilder().setName(WORKFLOW_NAME).build();
    client.deleteWorkflowAsync(deleteRequest);
    client.close();
  }

  @Test
  public void testGetWorkflow() {
    Workflow workflow = client.getWorkflow(WORKFLOW_NAME);
    assertEquals(expectedWorkflow, workflow);
  }

  @Test
  public void testUpdateWorkflow() throws ExecutionException, InterruptedException {
    Workflow workflow =
        Workflow.newBuilder().setName(WORKFLOW_NAME).setDescription(WORKFLOW_DESCRIPTION).build();
    FieldMask updateField = FieldMaskUtil.fromString("description");
    UpdateWorkflowRequest request =
        UpdateWorkflowRequest.newBuilder().setWorkflow(workflow).setUpdateMask(updateField).build();
    Workflow updateWorkflow = client.updateWorkflowAsync(request).get();
    assertEquals(expectedWorkflow, updateWorkflow);
  }

  @Test
  public void testListWorkflows() {
    ListWorkflowsRequest request = ListWorkflowsRequest.newBuilder().setParent(PARENT).build();
    for (Workflow actualWorkflow : client.listWorkflows(request).iterateAll()) {
      assertEquals(WORKFLOW_NAME, actualWorkflow.getName());
      assertEquals(expectedWorkflow, actualWorkflow);
    }
  }
}
