/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/

package org.apache.cayenne.dba.oracle;

import org.apache.cayenne.di.AdhocObjectFactory;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.map.DataMap;
import org.apache.cayenne.query.InsertBatchQuery;
import org.apache.cayenne.runtime.CayenneRuntime;
import org.apache.cayenne.unit.di.runtime.CayenneProjects;
import org.apache.cayenne.unit.di.runtime.RuntimeCase;
import org.apache.cayenne.unit.di.runtime.UseCayenneRuntime;
import org.junit.Test;

import java.sql.Types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@UseCayenneRuntime(CayenneProjects.LOB_PROJECT)
public class OracleAdapterIT extends RuntimeCase {

    @Inject
    private CayenneRuntime runtime;
    
    @Inject
    private AdhocObjectFactory objectFactory;

    @Test
    public void testUpdatesLOBColumns() throws Exception {
        DataMap map = runtime.getDataDomain().getDataMap("lob");
        assertTrue(OracleAdapter.updatesLOBColumns(new InsertBatchQuery(map
                .getDbEntity("BLOB_TEST"), 1)));
        assertTrue(OracleAdapter.updatesLOBColumns(new InsertBatchQuery(map
                .getDbEntity("CLOB_TEST"), 1)));
        assertFalse(OracleAdapter.updatesLOBColumns(new InsertBatchQuery(map
                .getDbEntity("TEST"), 1)));
    }

    @Test
    public void testTimestampMapping() throws Exception {
        
        OracleAdapter adapter = objectFactory.newInstance(
                OracleAdapter.class, 
                OracleAdapter.class.getName());

        String[] types = adapter.externalTypesForJdbcType(Types.TIMESTAMP);
        assertNotNull(types);
        assertEquals(1, types.length);
        assertEquals("TIMESTAMP", types[0]);
    }
}
