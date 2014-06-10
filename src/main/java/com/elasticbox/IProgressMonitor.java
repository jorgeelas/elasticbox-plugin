/*
 * ElasticBox Confidential
 * Copyright (c) 2014 All Right Reserved, ElasticBox Inc.
 *
 * NOTICE:  All information contained herein is, and remains the property
 * of ElasticBox. The intellectual and technical concepts contained herein are
 * proprietary and may be covered by U.S. and Foreign Patents, patents in process,
 * and are protected by trade secret or copyright law. Dissemination of this
 * information or reproduction of this material is strictly forbidden unless prior
 * written permission is obtained from ElasticBox.
 */

package com.elasticbox;

import java.io.IOException;

/**
 *
 * @author Phong Nguyen Le
 */
public interface IProgressMonitor {
    public static class IncompleteException extends Exception {
        public IncompleteException(String message) {
            super(message);
        }
    }
    
    String getResourceUrl();
    
    boolean isDone() throws IncompleteException, IOException;
    
    long getCreationTime();
    
    /**
     * 
     * @param timeout in minutes
     * @throws com.elasticbox.IProgressMonitor.IncompleteException
     * @throws IOException 
     */
    void waitForDone(int timeout) throws IncompleteException, IOException;
}