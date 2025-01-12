/*
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
package org.apache.struts.chain.commands.servlet;

import org.apache.struts.chain.commands.AbstractPerformInclude;
import org.apache.struts.chain.contexts.ActionContext;
import org.apache.struts.chain.contexts.ServletActionContext;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>Perform forwarding or redirection based on the specified include uri (if
 * any).</p>
 *
 * @version $Rev$ $Date: 2005-11-09 00:11:45 -0500 (Wed, 09 Nov 2005)
 *          $
 */
public class PerformInclude extends AbstractPerformInclude {
    // ------------------------------------------------------- Protected Methods

    /**
     * <p>Perform the appropriate processing on the specified include
     * uri.</p>
     *
     * @param context The context for this request
     * @param uri     The uri to be included
     */
    protected void perform(ActionContext context, String uri)
        throws Exception {
        ServletActionContext swcontext = (ServletActionContext) context;

        HttpServletRequest request = swcontext.getRequest();

        RequestDispatcher rd = swcontext.getContext().getRequestDispatcher(uri);

        rd.forward(request, swcontext.getResponse());
    }
}
