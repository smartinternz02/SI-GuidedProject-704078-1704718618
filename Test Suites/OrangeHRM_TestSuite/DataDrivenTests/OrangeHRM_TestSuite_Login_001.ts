<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>OrangeHRM_TestSuite_Login_001</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>4bc525ed-3d18-49c1-a63d-e4a841b40eb0</testSuiteGuid>
   <testCaseLink>
      <guid>494354ad-e289-4864-87bb-38c6d4694846</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Data Driven/TC_OrangeHRM_Login_Negative_003</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>f4a1858f-f2f8-4e82-ac8e-72f8b5e2cd47</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/OrangeHRM_Login_TestData</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>f4a1858f-f2f8-4e82-ac8e-72f8b5e2cd47</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>b14bb0aa-2fd5-4540-bd74-21542389be46</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>f4a1858f-f2f8-4e82-ac8e-72f8b5e2cd47</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>50eb4a96-57e9-4a05-83a9-8feb17466462</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
