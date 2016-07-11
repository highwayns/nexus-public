/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2008-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.repository.security;

import org.sonatype.nexus.selector.SelectorConfiguration;
import org.sonatype.nexus.selector.VariableSource;

/**
 * Repository content permission checker
 *
 * @since 3.1
 */
public interface ContentPermissionChecker
{
  /**
   * Ensure that the view permission for the desired repository/action is permitted
   */
  boolean isViewPermitted(String repositoryName, String repositoryFormat, String action);

  /**
   * Ensure that the content selector permission for the desired repository/action is permitted
   */
  boolean isContentPermitted(String repositoryName,
                             String repositoryFormat,
                             String action,
                             SelectorConfiguration selectorConfiguration,
                             VariableSource variableSource);
}