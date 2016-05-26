# Multi-threaded issues are a Bear to reproduce
Code to reproduce https://github.com/grails/grails-data-mapping/issues/719

Navigate to:
* http://localhost:8080/home/hello/ccc 

Expected results:
* username:'ccc' cmsSiteId:'222'

Observed (every so often):
* username:'aaa' cmsSiteId:'0'
* Once the wrong result is shown - the issue sticks

The jmeter script that I used:
https://github.com/ColinHarrington/bear/blob/master/jmeter-bear.jmx
