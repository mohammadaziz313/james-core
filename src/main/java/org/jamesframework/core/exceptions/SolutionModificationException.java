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

package org.jamesframework.core.exceptions;

import org.jamesframework.core.problems.solutions.Solution;

/**
 * Exception thrown when trying to apply an invalid modification to a solution.
 * 
 * @author Herman De Beukelaer <herman.debeukelaer@ugent.be>
 */
public class SolutionModificationException extends JamesRuntimeException {

    // solution that was being modified
    private final Solution solution;
    
    /**
     * Creates a new instance without detail message.
     * 
     * @param solution solution that was being modified
     */
    public SolutionModificationException(Solution solution) {
        this.solution = solution;
    }

    /**
     * Constructs an instance with the specified detail message.
     * 
     * @param msg the detail message
     * @param solution solution that was being modified
     */
    public SolutionModificationException(String msg, Solution solution) {
        super(msg);
        this.solution = solution;
    }

    /**
     * Constructs an instance with the specified cause.
     * 
     * @param cause other exception that caused this exception
     * @param solution solution that was being modified
     */
    public SolutionModificationException(Throwable cause, Solution solution) {
        super(cause);
        this.solution = solution;
    }

    /**
     * Constructs an instance with the specified detail message and cause.
     * 
     * @param msg the detail message
     * @param cause other exception that caused this exception
     * @param solution solution that was being modified
     */
    public SolutionModificationException(String msg, Throwable cause, Solution solution) {
        super(msg, cause);
        this.solution = solution;
    }
    
    /**
     * Extend string representation to include solution that was being modified.
     * 
     * @return string representation including modified solution
     */
    @Override
    public String toString(){
        String s = super.toString();
        return s + " -- modified solution: " + solution;
    }

}
