/* Copyright (c) 2012-2016 Boundless and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/org/documents/edl-v10.html
 *
 * Contributors:
 * Gabriel Roldan (Boundless) - initial implementation
 */
package org.geogig.test.integration.je.repository;

import org.geogig.test.integration.je.JETestContextBuilder;
import org.locationtech.geogig.repository.Context;
import org.locationtech.geogig.repository.Hints;

public class JEIndexTest extends org.locationtech.geogig.test.integration.repository.IndexTest {
    @Override
    protected Context createInjector() {
        Hints hints = new Hints().uri(repositoryDirectory.toURI()).platform(createPlatform());
        return new JETestContextBuilder().build(hints);
    }
}
