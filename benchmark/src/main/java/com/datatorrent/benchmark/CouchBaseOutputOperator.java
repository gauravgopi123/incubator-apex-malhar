/*
 * Copyright (c) 2014 DataTorrent, Inc. ALL Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datatorrent.benchmark;

import com.datatorrent.contrib.couchbase.AbstractCouchBaseSetOperator;

/**
 * <p>CouchBaseOutputOperator class.</p>
 *
 * @since 2.0.0
 */
public class CouchBaseOutputOperator extends AbstractCouchBaseSetOperator<Integer>
{

  @Override
  public String getKey(Integer tuple)
  {
    return "Key" + tuple;
  }

  @Override
  public Object getValue(Integer tuple)
  {
    tuple = 500;
    return tuple;
  }

}
