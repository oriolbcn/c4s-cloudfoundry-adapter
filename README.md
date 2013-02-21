# CloudFoundry Adapter for Cloud4SOA

CloudFoundryAdapter
1.0.0-SNAPSHOT.
20.02.2013.

## License and Copyright

Copyright [2013] [Oriol Collell Martin]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

## Introduction

The CloudFoundry Adapter component is part of the Cloud4SOA Europeran research project (http://www.cloud4soa.eu/) and it is used
by the platform to integrate CloudFoundry with it. The adapter permits executing all the main Cloud4SOA use cases: Match-making, deployment,
governance, monitoring and undeployment.

We have used the CloudFoundry Java library to implement the methods of the adapter that communicate to the CloudFoundry API (https://github.com/cloudfoundry/vcap-java-client).
For more details about the CloudFoundry code, it can be found at: https://github.com/cloudfoundry.

## Functions

The adapter implements the following functionalities:
* List Applications: List all applications running on CloudFoundry.
* Get Application Details: Obtain information about an application.
* Delete Application: Delete and undeploy an application.
* Start/Stop an application.
* Get DB List: Get the list of databases bound to an application.
* Get DB Details: Get the details of a database bound to an application.
* Create Database: Create a DB bound to an application.
* Delete Database: Delete a DB bound to an application.
* doMonitoring: Return status message.

**NOTE**: The rest of the functionalities of the adapter are implemented in its local part, which is interwiened with the base Cloud4SOA code and, thus,
cannot be included here.

## Using the Software
This component can be used as a stand-alone RESTful Web Service, but it is only relevant in the context of a full Cloud4SOA deployment.

### Software Dependencies

This component has been written in Java, therefore it needs a JVM to run. We have used Maven to manage the dependencies and build process of the project,
therefore, you will need to have Maven installed too.

All dependencies with external libraries are described in the POM.


### Installation and Execution Instructions

This sceript can be installed by running the `mvn clean install` command on the project root. This generates a ".war" archive in the "target" directory.
This ".war" file can then be deployed in a compliant Web Service, such as Tomcat and used through standard HTTP requests.

## Contributors
Oriol Collell Martin

## Contact Information and Website

http://www.cloud4soa.eu/

We welcome your feedback, suggestions and contributions. Contact us
via email if you have questions, feedback, code submissions, 
and bug reports.

For general inquiries, see http://www.cloud4soa.eu/contact
