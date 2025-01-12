/*
 * Copyright 2003,2004 The Apache Software Foundation.
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

import org.apache.struts.chain.commands.AbstractSetContentType;
import org.apache.struts.chain.contexts.ActionContext;
import org.apache.struts.chain.contexts.ServletActionContext;

import javax.servlet.http.HttpServletResponse;

/**
 * <p>Check to see if the content type is set, and if so, set it for this
 * response.</p>
 *
 * @version $Rev$ $Date: 2005-06-04 10:58:46 -0400 (Sat, 04 Jun 2005)
 *          $
 */
public class SetContentType extends AbstractSetContentType {
    // ------------------------------------------------------- Protected Methods
    protected void setContentType(ActionContext context, String contentType) {
        ServletActionContext swcontext = (ServletActionContext) context;
        HttpServletResponse response = swcontext.getResponse();

        response.setContentType(contentType);
    }
}
