/*
 * $Id$
 *
 * Copyright 2000-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.struts.action;


/**
 * <p>A subclass of <code>ActionForward</code> that defaults the
 * <code>redirect</code> attribute to <code>false</code>.</p>
 *
 * @version $Rev$ $Date: 2005-05-07 12:11:38 -0400 (Sat, 07 May 2005)
 *          $
 */
public class ForwardingActionForward extends ActionForward {
    // ----------------------------------------------------------- Constructors

    /**
     * <p>Construct a new instance with default values.</p>
     */
    public ForwardingActionForward() {
        this(null);
    }

    /**
     * <P>Construct a new instance with the specified path.</p>
     *
     * @param path Path for this instance
     */
    public ForwardingActionForward(String path) {
        super();
        setName(null);
        setPath(path);
        setRedirect(false);
    }
}
