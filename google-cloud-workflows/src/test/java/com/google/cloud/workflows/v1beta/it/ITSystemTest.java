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

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.cloud.workflows.v1beta.*;
import com.google.protobuf.AbstractMessage;
import java.util.List;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ITSystemTest {
  private static MockWorkflows mockWorkflows;
  private static MockServiceHelper serviceHelper;
  private static WorkflowsClient client;
  private static LocalChannelProvider channelProvider;
  private static final String LOCATION = "us-central1-a";
  private static final String WORKFLOW_ID =
      "test-workflow-" + UUID.randomUUID().toString().substring(0, 8);

  @BeforeClass
  public static void beforeClass() throws Exception {
    /** create workflow */
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    WorkflowsSettings settings =
        WorkflowsSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = WorkflowsClient.create(settings);
  }

  @Test
  public void getWorkflowTest() {
    WorkflowName name2 = WorkflowName.of("[PROJECT]", "[LOCATION]", "[WORKFLOW]");
    String description = "description-1724546052";
    String revisionId = "revisionId513861631";
    String serviceAccount = "serviceAccount-1948028253";
    String sourceContents = "sourceContents-1799875906";
    Workflow expectedResponse =
        Workflow.newBuilder()
            .setName(name2.toString())
            .setDescription(description)
            .setRevisionId(revisionId)
            .setServiceAccount(serviceAccount)
            .setSourceContents(sourceContents)
            .build();
    mockWorkflows.addResponse(expectedResponse);

    WorkflowName name = WorkflowName.of("[PROJECT]", "[LOCATION]", "[WORKFLOW]");

    Workflow actualResponse = client.getWorkflow(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWorkflows.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetWorkflowRequest actualRequest = (GetWorkflowRequest) actualRequests.get(0);

    Assert.assertEquals(name, WorkflowName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @AfterClass
  public static void afterClass() throws Exception {
    client.close();
  }
}
