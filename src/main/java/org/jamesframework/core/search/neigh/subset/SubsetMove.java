//  Copyright 2014 Herman De Beukelaer
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.

package org.jamesframework.core.search.neigh.subset;

import java.util.Set;

/**
 * General interface of a subset move that adds a number of IDs to the selection and/or
 * removes a number of IDs.
 * 
 * @author Herman De Beukelaer <herman.debeukelaer@ugent.be>
 */
public interface SubsetMove {

    /**
     * Get the set of IDs that are added to the selection by applying this move to a subset solution.
     * The returned set may be empty.
     * 
     * @return set of added IDs
     */
    public Set<Integer> getAddedIDs();
    
    /**
     * Get the set of IDs that are removed from the selection by applying this move to a subset solution.
     * The returned set may be empty.
     * 
     * @return set of removed IDs
     */
    public Set<Integer> getDeletedIDs();
    
    /**
     * Returns the number of added IDs, possibly 0.
     * 
     * @return number of added IDs
     */
    public int getNumAdded();
    
    /**
     * Returns the number of deleted IDs, possibly 0.
     * 
     * @return number of deleted IDs
     */
    public int getNumDeleted();
    
}