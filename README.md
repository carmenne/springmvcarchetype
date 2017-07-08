Quickstart a Spring Mvc application with jsp views

If you run the application in Eclipse, go to project Properties -> search for Targeted Runtime and select Apache Tomcat.

For creating a project based on this archetype:
- clone the project: git clone https://github.com/carmenne/springmvcarchetype.git
- go to springmvcarchetype and runt mvn clean install
- run the archetype goal: mvn archetype:generate -DarchetypeGroupId=com.carmen.templates -DarchetypeArtifactId=springmvc -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=[yourgroupId] -DartifactId=[yourartifactId] -Dpackage=[your package]
