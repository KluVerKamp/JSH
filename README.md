JSH
===
JSF 2 (inculding primefaces), Spring 4 and hibernate 4 integration mini project.

The code itself is found on Internet (<a href="http://www.javacodegeeks.com/2012/04/jsf-2-primefaces-3-spring-3-hibernate-4.html">From here</a>). 

To get started, install the database script from the file db.sql found inside root folder.


If u r using Eclipse for developing,
eclipse may show an error once u clone this porject. running a maven update to the porject would fix that.
And make sure that u have the m2e-wtp add-in installed.
Otherwise "mvn install" won't copy your classpath's dependencies to the web deployement lib directory.
If u want to build from the CMD, run "mvn ecilpse:eclipse -Dwtpversion=2".
Note that all the dependencies will be listed direclty under the root folder of the project, not under the "library" node under your classpath.
Still, it will build well.

For the latest version, the issue mentioned up here is fixed. So just run an mvn install and all should be all right.
