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

package org.jamesframework.core.problems;

import org.jamesframework.core.problems.solutions.Solution;

/**
 *  Interface of a problem with a generic solution type. Contains methods
 *  to evaluate a solution, to compare solutions based on their evaluation,
 *  and to create random solutions or to copy a solution.
 * 
 * @author Herman De Beukelaer <herman.debeukelaer@ugent.be>
 * @param <SolutionType> the solution type that corresponds to this problem, required to extend {@link Solution}
 */
public interface Problem<SolutionType extends Solution> {
    
    /**
     * Evaluates a given solution. The computed score reflects the quality of the solution;
     * depending on whether scores are maximized (or minimized), higher (respectively lower)
     * scores indicate improvement.
     * 
     * @param solution the solution to evaluate
     * @return evaluation of the solution
     */
    public double evaluate(SolutionType solution);
    
    /**
     * Computes the improvement in evaluation of the current solution as compared to the previous solution,
     * where improvement is equal to increase (decrease) when scores are being maximized (minimized, respectively).
     * A positive delta thus indicates that the current solution is better than the previous solution,
     * while a negative delta indicates that the previous solution was better.
     * 
     * @param prevEvaluation evaluation of previous solution
     * @param curEvaluation evaluation of current solution
     * @return improvement in evaluation, taking into account whether scores are maximized or minimized
     */
    public double getDelta(double prevEvaluation, double curEvaluation);
    
    /**
     * Creates a random solution. Such random solutions can for example be used as initial solution
     * for neighbourhood searches.
     * 
     * @return a random solution
     */
    public SolutionType createRandomSolution();
    
    /**
     * Creates a (deep) copy of the current solution.
     * 
     * @param solution solution to copy
     * @return a deep copy of the given solution
     */
    public SolutionType copySolution(SolutionType solution);
    
}
