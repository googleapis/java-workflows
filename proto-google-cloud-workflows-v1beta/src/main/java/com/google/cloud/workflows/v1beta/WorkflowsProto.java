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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/workflows/v1beta/workflows.proto

package com.google.cloud.workflows.v1beta;

public final class WorkflowsProto {
  private WorkflowsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1beta_Workflow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1beta_Workflow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1beta_Workflow_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1beta_Workflow_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1beta_ListWorkflowsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1beta_ListWorkflowsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1beta_ListWorkflowsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1beta_ListWorkflowsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1beta_GetWorkflowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1beta_GetWorkflowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1beta_CreateWorkflowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1beta_CreateWorkflowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1beta_DeleteWorkflowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1beta_DeleteWorkflowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1beta_UpdateWorkflowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1beta_UpdateWorkflowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1beta_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1beta_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "-google/cloud/workflows/v1beta/workflow"
          + "s.proto\022\035google.cloud.workflows.v1beta\032\034"
          + "google/api/annotations.proto\032\027google/api"
          + "/client.proto\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\032#google/longrunning/operations.proto\032"
          + " google/protobuf/field_mask.proto\032\037google/protobuf/timestamp.proto\"\376\004\n"
          + "\010Workflow\022\014\n"
          + "\004name\030\001 \001(\t\022\023\n"
          + "\013description\030\002 \001(\t\022A\n"
          + "\005state\030\003 \001(\016"
          + "2-.google.cloud.workflows.v1beta.Workflow.StateB\003\340A\003\022\030\n"
          + "\013revision_id\030\004 \001(\tB\003\340A\003\0224\n"
          + "\013create_time\030\005 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\006 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022=\n"
          + "\024revision_create_time\030\007"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022C\n"
          + "\006labels\030\010 \003(\01323.google.cloud"
          + ".workflows.v1beta.Workflow.LabelsEntry\022\027\n"
          + "\017service_account\030\t \001(\t\022\031\n"
          + "\017source_contents\030\n"
          + " \001(\tH\000\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r"
          + "\n"
          + "\005value\030\002 \001(\t:\0028\001\"*\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\n\n"
          + "\006ACTIVE\020\001:d\352Aa\n"
          + "!workflows.googleapis.com/Workflow\022<projects/{project"
          + "}/locations/{location}/workflows/{workflow}B\r\n"
          + "\013source_code\"\232\001\n"
          + "\024ListWorkflowsRequest\0229\n"
          + "\006parent\030\001 \001(\tB)\340A\002\372A#\n"
          + "!locations.googleapis.com/Location\022\021\n"
          + "\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\022\016\n"
          + "\006filter\030\004 \001(\t\022\020\n"
          + "\010order_by\030\005 \001(\t\"\201\001\n"
          + "\025ListWorkflowsResponse\022:\n"
          + "\tworkflows\030\001 \003(\0132\'.google.cloud.workflows.v1beta.Workflow\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\023\n"
          + "\013unreachable\030\003 \003(\t\"M\n"
          + "\022GetWorkflowRequest\0227\n"
          + "\004name\030\001 \001(\tB)\340A\002\372A#\n"
          + "!workflows.googleapis.com/Workflow\"\254\001\n"
          + "\025CreateWorkflowRequest\0229\n"
          + "\006parent\030\001 \001(\tB)\340A\002\372A#\n"
          + "!locations.googleapis.com/Location\022>\n"
          + "\010workflow\030\002"
          + " \001(\0132\'.google.cloud.workflows.v1beta.WorkflowB\003\340A\002\022\030\n"
          + "\013workflow_id\030\003 \001(\tB\003\340A\002\"P\n"
          + "\025DeleteWorkflowRequest\0227\n"
          + "\004name\030\001 \001(\tB)\340A\002\372A#\n"
          + "!workflows.googleapis.com/Workflow\"\210\001\n"
          + "\025UpdateWorkflowRequest\022>\n"
          + "\010workflow\030\001"
          + " \001(\0132\'.google.cloud.workflows.v1beta.WorkflowB\003\340A\002\022/\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.FieldMask\"\245\001\n"
          + "\021OperationMetadata\022/\n"
          + "\013create_time\030\001 \001(\0132\032.google.protobuf.Timestamp\022,\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.Timestamp\022\016\n"
          + "\006target\030\003 \001(\t\022\014\n"
          + "\004verb\030\004 \001(\t\022\023\n"
          + "\013api_version\030\005 \001(\t2\371\010\n"
          + "\tWorkflows\022\276\001\n\r"
          + "ListWorkflows\0223.google.cloud.workflows.v1beta.ListWorkflowsRequest\0324.go"
          + "ogle.cloud.workflows.v1beta.ListWorkflow"
          + "sResponse\"B\202\323\344\223\0023\0221/v1beta/{parent=proje"
          + "cts/*/locations/*}/workflows\332A\006parent\022\253\001\n"
          + "\013GetWorkflow\0221.google.cloud.workflows.v"
          + "1beta.GetWorkflowRequest\032\'.google.cloud."
          + "workflows.v1beta.Workflow\"@\202\323\344\223\0023\0221/v1be"
          + "ta/{name=projects/*/locations/*/workflows/*}\332A\004name\022\351\001\n"
          + "\016CreateWorkflow\0224.google.cloud.workflows.v1beta.CreateWorkflowReq"
          + "uest\032\035.google.longrunning.Operation\"\201\001\202\323"
          + "\344\223\002=\"1/v1beta/{parent=projects/*/locatio"
          + "ns/*}/workflows:\010workflow\332A\033parent,workflow,workflow_id\312A\035\n"
          + "\010Workflow\022\021OperationMetadata\022\324\001\n"
          + "\016DeleteWorkflow\0224.google.cloud.workflows.v1beta.DeleteWorkflowRequest"
          + "\032\035.google.longrunning.Operation\"m\202\323\344\223\0023*"
          + "1/v1beta/{name=projects/*/locations/*/workflows/*}\332A\004name\312A*\n"
          + "\025google.protobuf.Empty\022\021OperationMetadata\022\353\001\n"
          + "\016UpdateWorkflow\0224.google.cloud.workflows.v1beta.Update"
          + "WorkflowRequest\032\035.google.longrunning.Ope"
          + "ration\"\203\001\202\323\344\223\002F2:/v1beta/{workflow.name="
          + "projects/*/locations/*/workflows/*}:\010workflow\332A\024workflow,update_mask\312A\035\n"
          + "\010Workflow\022\021OperationMetadata\032L\312A\030workflows.googl"
          + "eapis.com\322A.https://www.googleapis.com/auth/cloud-platformB}\n"
          + "!com.google.cloud.workflows.v1betaB\016WorkflowsProtoP\001ZFgoogl"
          + "e.golang.org/genproto/googleapis/cloud/workflows/v1beta;workflowsb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_workflows_v1beta_Workflow_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_workflows_v1beta_Workflow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1beta_Workflow_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "State",
              "RevisionId",
              "CreateTime",
              "UpdateTime",
              "RevisionCreateTime",
              "Labels",
              "ServiceAccount",
              "SourceContents",
              "SourceCode",
            });
    internal_static_google_cloud_workflows_v1beta_Workflow_LabelsEntry_descriptor =
        internal_static_google_cloud_workflows_v1beta_Workflow_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_workflows_v1beta_Workflow_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1beta_Workflow_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_workflows_v1beta_ListWorkflowsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_workflows_v1beta_ListWorkflowsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1beta_ListWorkflowsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_workflows_v1beta_ListWorkflowsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_workflows_v1beta_ListWorkflowsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1beta_ListWorkflowsResponse_descriptor,
            new java.lang.String[] {
              "Workflows", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_workflows_v1beta_GetWorkflowRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_workflows_v1beta_GetWorkflowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1beta_GetWorkflowRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_workflows_v1beta_CreateWorkflowRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_workflows_v1beta_CreateWorkflowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1beta_CreateWorkflowRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Workflow", "WorkflowId",
            });
    internal_static_google_cloud_workflows_v1beta_DeleteWorkflowRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_workflows_v1beta_DeleteWorkflowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1beta_DeleteWorkflowRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_workflows_v1beta_UpdateWorkflowRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_workflows_v1beta_UpdateWorkflowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1beta_UpdateWorkflowRequest_descriptor,
            new java.lang.String[] {
              "Workflow", "UpdateMask",
            });
    internal_static_google_cloud_workflows_v1beta_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_workflows_v1beta_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1beta_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "EndTime", "Target", "Verb", "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
