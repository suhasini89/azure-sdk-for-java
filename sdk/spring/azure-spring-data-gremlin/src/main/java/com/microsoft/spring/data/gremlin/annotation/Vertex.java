// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.spring.data.gremlin.annotation;

import com.microsoft.spring.data.gremlin.common.Constants;
import org.springframework.data.annotation.Persistent;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Specifies the class as vertex in graph, with one optional label(String).
 */
@Persistent
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Vertex {
    /**
     * The label(gremlin reserved) of given Vertex, can add Vertex by label.
     *
     * @return class name if not specify.
     */
    String label() default Constants.DEFAULT_VERTEX_LABEL;
}
