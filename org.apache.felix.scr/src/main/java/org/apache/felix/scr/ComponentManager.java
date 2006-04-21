/*
 *   Copyright 2006 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package org.apache.felix.scr;

/**
 * This interface is provided so that there can be multiple implementations of 
 * managers that are responsible for managing component's lifecycle.  
 * 
 */
public interface ComponentManager {
	
	/**
	 * Enable the component
	 * 
	 * @return true if it was succesfully enabled, false otherwise
	 */
	public boolean enable();
	
	/**
	 * Dispose the component
	 * 
	 */
	public void dispose();

	/**
	 * Get the component information
	 * 
	 * @return a ComponentMetadata object
	 */
	public ComponentMetadata getComponentMetadata();
}
