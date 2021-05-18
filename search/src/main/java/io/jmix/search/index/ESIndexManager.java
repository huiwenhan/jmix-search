/*
 * Copyright 2021 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.jmix.search.index;

import org.elasticsearch.client.indices.GetIndexResponse;

import java.io.IOException;

/**
 * Provides functionality for index management.
 */
public interface ESIndexManager {

    /**
     * Creates index if not exists using provided {@link IndexConfiguration}.
     *
     * @param indexConfiguration index configuration
     * @return true if index was successfully created, false otherwise
     * @throws IOException if there is a problem with request/response processing
     */
    boolean createIndex(IndexConfiguration indexConfiguration) throws IOException;

    /**
     * Drops index by name.
     *
     * @param indexName index name
     * @return true if index was successfully dropped, false otherwise
     * @throws IOException if there is a problem with request/response processing
     */
    boolean dropIndex(String indexName) throws IOException;

    /**
     * Drops (if exists) and creates index using provided {@link IndexConfiguration}.
     *
     * @param indexConfiguration index configuration
     * @return true if index was successfully recreated, false otherwise
     * @throws IOException if there is a problem with request/response processing
     */
    boolean recreateIndex(IndexConfiguration indexConfiguration) throws IOException;

    /**
     * Checks if index exists.
     *
     * @param indexName index name
     * @return true if index exists, false otherwise
     * @throws IOException in case of request failure
     */
    boolean isIndexExist(String indexName) throws IOException;

    /**
     * Checks if index has actual configuration.
     *
     * @param indexConfiguration actual configuration
     * @return true if existing index has the same configuration as the provided one, false otherwise
     * @throws IOException in case of request failure
     */
    boolean isIndexActual(IndexConfiguration indexConfiguration) throws IOException;

    /**
     * Requests info about index from ES cluster.
     *
     * @param indexName index name
     * @return response
     * @throws IOException in case of request failure
     */
    GetIndexResponse getIndex(String indexName) throws IOException;

    /**
     * Updates all search indices defined in application to the actual state.
     * <p>Non-existent index will be created, irrelevant index will be recreated.
     * <p>See {@link ESIndexManager#synchronizeIndex(IndexConfiguration)}
     */
    void synchronizeIndexes();

    /**
     * Updates index to the actual state.
     * <p>Non-existent index will be created, irrelevant index will be recreated.
     * <p>See {@link ESIndexManager#synchronizeIndexes}
     *
     * @param indexConfiguration actual index configuration
     */
    void synchronizeIndex(IndexConfiguration indexConfiguration);
}