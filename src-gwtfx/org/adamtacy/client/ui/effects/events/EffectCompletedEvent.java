/*
 * Copyright 2008-2009 Adam Tacy <adam.tacy AT gmail.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * Copyright 2011 Vancouver Ywebb Consulting Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.adamtacy.client.ui.effects.events;

import com.google.gwt.event.shared.GwtEvent;

public class EffectCompletedEvent extends GwtEvent<EffectCompletedHandler> {
  private static Type<EffectCompletedHandler> TYPE = new Type<EffectCompletedHandler>();

  protected void fire(HasEffectCompletedEventHandlers source) {    
    source.fireEvent(new EffectCompletedEvent());
  }
  
  /**
   * Gets the event type associated with load events.
   * 
   * @return the handler type
   */
  public static com.google.gwt.event.shared.GwtEvent.Type<EffectCompletedHandler> getType() {
    return TYPE;
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<EffectCompletedHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(EffectCompletedHandler handler) {
    handler.onEffectCompleted(this);
  } 

}
