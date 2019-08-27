# struts1
[![Build Status](https://travis-ci.org/lawrencexu/struts1.svg?branch=struts_1.3.5)](https://travis-ci.org/lawrencexu/struts1.svg?branch=struts_1.3.5)

Apache Struts 1 CVE issues fix

Fix the issues described in https://www.cvedetails.com/vulnerability-list/vendor_id-45/product_id-6117/version_id-164424/Apache-Struts-1.3.5.html

[CVE-2015-0899](https://www.cvedetails.com/cve/CVE-2015-0899/)  
Solution is in [this commit](commit/646632ea5f7081a73a4b17cfa489b4fc2c8cddd8).

[CVE-2014-0114](https://www.cvedetails.com/cve/CVE-2014-0114/)  
Solution:  
Upgrade commons-beanutils lib to latest 1.9.4.  
More details in http://commons.apache.org/proper/commons-beanutils/javadocs/v1.9.4/RELEASE-NOTES.txt.

[CVE-2016-1181](https://www.cvedetails.com/cve/CVE-2016-1181/)  
[CVE-2016-1182](https://www.cvedetails.com/cve/CVE-2016-1182/)  
Solution:  
Do nothing. As these two depends on [CVE-2014-0114](https://www.cvedetails.com/cve/CVE-2014-0114/) which is fixed already.  
And according to comments in [link1](https://security-tracker.debian.org/tracker/CVE-2016-1181) and 
[link2](https://security-tracker.debian.org/tracker/CVE-2016-1182), we should not include the mentioned commit as a general solution. 