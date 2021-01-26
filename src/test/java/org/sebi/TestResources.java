package org.sebi;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;

@QuarkusTestResource(H2DatabaseTestResource.class)
@QuarkusTestResource(MockOidcServerTestResource.class)
public class TestResources {}
