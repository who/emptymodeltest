This is a repo designed to reproduce/illustrate an issue with Springfox 2.0.0

Bash instructions to start the service:

```
cd $(mktemp -d /tmp/tmp.XXXXXXXX);
git clone https://github.com/who/emptymodeltest.git;
cd emptymodeltest;
mvn clean install;
mvn exec:java;
```

After executing the above, in a new terminal window, `curl http://localhost:8081/emptymodeltest/v2/api-docs`

EXPECTED: The `definitions`  section is populated with a full `ComplexRequest` object.

ACTUAL: The `ComplexRequest` object is empty: `"definitions":{"ComplexRequest":{}}}`




