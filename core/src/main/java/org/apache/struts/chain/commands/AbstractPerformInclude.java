/*
 * $Id$
 *
 * Copyright 2003-2005 The Apache Software Foundation.
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
package org.apache.struts.chain.commands;

import org.apache.struts.chain.contexts.ActionContext;
import org.apache.struts.config.ModuleConfig;

/**
 * <p>Perform forwarding or redirection based on the specified
 * <code>String</code> (if any).</p>
 *
 * @version $Rev$ $Date: 2005-06-04 10:58:46 -0400 (Sat, 04 Jun 2005)
 *          $
 */
public abstract class AbstractPerformInclude extends ActionCommandBase {
    // ---------------------------------------------------------- Public Methods

    /**
     * <p>Perform an include based on the specified include uri (if any).</p>
     *
     * @param actionCtx The <code>Context</code> for the current request
     * @return <code>true</code> so that processing completes
     * @throws Exception if thrown by the <code>Action</code>
     */
    public boolean execute(ActionContext actionCtx)
        throws Exception {
        ModuleConfig moduleConfig = actionCtx.getModuleConfig();

        // Is there an include to be performed?
        String include = actionCtx.getInclude();

        if (include == null) {
            return (false);
        }

        // Determine the currect uri
        String uri = moduleConfig.getPrefix() + include;

        // Perform the appropriate processing on this include uri
        perform(actionCtx, uri);

        return (true);
    }

    // ------------------------------------------------------- Protected Methods

    /**
     * <p>Perform the appropriate processing on the specified include
     * uri.</p>
     *
     * @param context The context for this request
     * @param include The forward to be performed
     * @throws Exception if thrown by the <code>Action</code>
     */
    protected abstract void perform(ActionContext context, String include)
        throws Exception;
}
