OO-tests

[![Build Status (Travis)](https://img.shields.io/travis/pragmatic-objects/oo-tests/master.svg)](https://travis-ci.org/pragmatic-objects/oo-tests)
[![Build status](https://ci.appveyor.com/api/projects/status/ojpyygrx443ur29e/branch/master?svg=true)](https://ci.appveyor.com/project/skapral/oo-tests/branch/master)

[![Codecov](https://codecov.io/gh/pragmatic-objects/oo-tests/branch/master/graph/badge.svg)](https://codecov.io/gh/pragmatic-objects/oo-tests)


Introduction:

Good tests must have only [one statement](https://www.yegor256.com/2017/05/17/single-statement-unit-tests.html). In theory,
it's hard to disagree with that. But in practice sometimes it's hard to achieve. Some modules under test may have 
complex preconditions and assumptions, and their simulation may n't fit into one statement.

For example, consider a class, which makes a call to some HTTP API: 
- In order to make a good isolated unit test for such class, one will need to bootstrap and configure mock HTTP server. It
is not usually a single-statement operation.
- If the code for bootstrapping mock HTTP server is located in test code or in BeforeTest/AfterTest blocks, it means that 
it's coverage is not tracked. It is not tested, yet may contain mistakes.
- There may be another classes which call the same HTTP API. But the mock server initialization in Before/AfterTest
block is not reusable outside the test module.

OO-tests project provides new way of testing object-oriented code. Reusable assertion is a Java class which implements 
`com.pragmaticobjects.oo.tests.Assertion` interface. It's aim is to validate some certain invariant on the object under 
test. As an ordinary classes, assertions may be covered with tests and distributed together with classes, so that developers
which extend your code may use them for their own tests.

OO-tests currently supports only JUnit5. It is highly recommented (but not mandatory) to use OO-tests on OO-atom-based
projects. In order to start using the concept, add the maven dependency:

```
    <dependency>
        <groupId>com.pragmaticobjects.oo.tests</groupId>
        <artifactId>tests-junit5</artifactId>
        <version>x.y.z</version>
    </dependency>
``` 
