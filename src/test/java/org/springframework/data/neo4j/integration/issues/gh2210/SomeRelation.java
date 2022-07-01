/*
 * Copyright 2011-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.neo4j.integration.issues.gh2210;

import org.springframework.data.neo4j.core.schema.RelationshipId;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

/**
 * @author Michael J. Simons
 * @soundtrack Sodom - Sodom
 */
// tag::custom-query.paths.dm[]
@RelationshipProperties
public class SomeRelation {

	@RelationshipId
	private Long id;

	private String someData;

	@TargetNode
	private SomeEntity targetPerson;
	// end::custom-query.paths.dm[]

	public Long getId() {
		return id;
	}

	public String getSomeData() {
		return someData;
	}

	public SomeEntity getTargetPerson() {
		return targetPerson;
	}
	// tag::custom-query.paths.dm[]
}
// end::custom-query.paths.dm[]