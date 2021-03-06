/*
 * Copyright (c) 2016 The original author or authors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 *      The Eclipse Public License is available at
 *      http://www.eclipse.org/legal/epl-v10.html
 *
 *      The Apache License v2.0 is available at
 *      http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */

package io.engagingspaces.graphql.marshaller.schema;

import io.engagingspaces.graphql.marshaller.json.JsonSerializable;

/**
 * Interface that is implemented by GraphQL schema decorator instances.
 *
 * @param <T> type parameter indicating the type of schema object that is decorated
 * @author <a href="https://github.com/aschrijver/">Arnold Schrijver</a>
 */
public interface SchemaDecorator<T> extends JsonSerializable {

    /**
     * @return the original graphql schema object that is decorated by this instance
     */
    T original();
}
