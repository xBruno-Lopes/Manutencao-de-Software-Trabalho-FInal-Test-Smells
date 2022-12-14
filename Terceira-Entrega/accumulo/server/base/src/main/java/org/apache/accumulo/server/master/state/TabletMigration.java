/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.accumulo.server.master.state;

import org.apache.accumulo.core.dataImpl.KeyExtent;
import org.apache.accumulo.core.metadata.TServerInstance;

/**
 * @deprecated since 2.1.0. Use balancers in org.apache.accumulo.core.spi.balancer instead.
 */
@Deprecated(since = "2.1.0")
public class TabletMigration {
  public KeyExtent tablet;
  public TServerInstance oldServer;
  public TServerInstance newServer;

  public TabletMigration(KeyExtent extent, TServerInstance before, TServerInstance after) {
    this.tablet = extent;
    this.oldServer = before;
    this.newServer = after;
  }

  @Override
  public String toString() {
    return tablet + ": " + oldServer + " -> " + newServer;
  }
}
