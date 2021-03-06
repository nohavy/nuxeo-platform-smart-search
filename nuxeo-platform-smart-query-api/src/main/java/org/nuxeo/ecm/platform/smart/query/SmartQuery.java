/*
 * (C) Copyright 2010 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Anahide Tchertchian
 */
package org.nuxeo.ecm.platform.smart.query;

import java.io.Serializable;

/**
 * Common interface for query build
 *
 * @since 5.4
 * @author Anahide Tchertchian
 */
public interface SmartQuery extends Serializable {

    /**
     * Returns a String with the built query (or query part).
     */
    String buildQuery();

    /**
     * Returns true if query is valid.
     */
    boolean isValid();

}
