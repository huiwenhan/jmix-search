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

package io.jmix.search.index.mapping.analysis.impl;

import io.jmix.search.index.mapping.analysis.AnalysisConfigurationStages;

public class AnalyzerConfigurer implements AnalyzerConfigurationStages {
    //todo
    @Override
    public AnalysisConfigurationStages.SetupParameters configureBuiltInAnalyzer(String analyzerTypeName) {
        return null;
    }

    @Override
    public AnalysisConfigurationStages.SetupTokenizer createCustom() {
        return null;
    }

    @Override
    public void withNativeConfiguration(String nativeConfiguration) {

    }

    @Override
    public AnalysisConfigurationStages.SetupParameters withParameter(String key, Object value) {
        return null;
    }

    @Override
    public AnalysisConfigurationStages.SetupFilters withTokenizer(String tokenizerName) {
        return null;
    }

    @Override
    public AnalysisConfigurationStages.SetupFilters withCharacterFilters(String... charFilterNames) {
        return null;
    }

    @Override
    public AnalysisConfigurationStages.SetupFilters withTokenFilters(String... tokenFilterNames) {
        return null;
    }
}
