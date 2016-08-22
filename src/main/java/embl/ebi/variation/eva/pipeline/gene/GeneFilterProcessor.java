/*
 * Copyright 2016 EMBL - European Bioinformatics Institute
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
package embl.ebi.variation.eva.pipeline.gene;

import org.springframework.batch.item.ItemProcessor;

/**
 * Created by jmmut on 2016-08-16.
 *
 * @author Jose Miguel Mut Lopez &lt;jmmut@ebi.ac.uk&gt;
 */
public class GeneFilterProcessor implements ItemProcessor<FeatureCoordinates, FeatureCoordinates> {
    @Override
    public FeatureCoordinates process(FeatureCoordinates item) throws Exception {
        if (item.getFeature().equals("gene") || item.getFeature().equals("transcript")) {
            return item;
        } else {
            return null;
        }
    }
}