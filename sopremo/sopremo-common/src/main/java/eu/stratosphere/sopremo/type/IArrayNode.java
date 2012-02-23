/***********************************************************************************************************************
 *
 * Copyright (C) 2010 by the Stratosphere project (http://stratosphere.eu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 **********************************************************************************************************************/
package eu.stratosphere.sopremo.type;

import java.util.Collection;

/**
 * @author Michael Hopstock
 * @author Tommy Neubert
 */
public interface IArrayNode extends Iterable<IJsonNode>, IJsonNode {

	public abstract int size();

	public abstract IArrayNode add(final IJsonNode node);

	public abstract void add(final int index, final IJsonNode element);

	/**
	 * @param index
	 *        the index which should be returned
	 * @return element at <code>index</code> or {@link eu.stratosphere.sopremo.type.MissingNode MissingNode}, when
	 *         <code>index</code> is out of bounds or not present
	 */

	public abstract IJsonNode get(final int index);

	public abstract IJsonNode set(final int index, final IJsonNode node);

	public abstract IJsonNode remove(final int index);

	public abstract void clear();

	public abstract IArrayNode addAll(final Collection<? extends IJsonNode> c);

	/**
	 * @return
	 */
	public abstract Object[] toArray();

}