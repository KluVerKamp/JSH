JSH
===
JSF 2 (inculding primefaces), Spring 3 and hibernate 4 integration mini project.

The code itself is found on Internet. If u r using Eclipse for developing make sure that u have the m2e-wtp add-in installed.
Otherwise "mvn install" won't copy your classpath's dependencies to the web deployement lib directory.
If u want to build from the CMD, run "mvn ecilpse:eclipse -Dwtpversion=2".
Note that all the dependencies will be listed direclty under the root folder of the project, not under the "library" node under your classpath.
Still, it will build well.
