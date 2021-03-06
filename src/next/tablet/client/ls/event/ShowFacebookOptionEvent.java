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
package next.tablet.client.ls.event;

import com.google.gwt.event.shared.GwtEvent;

public class ShowFacebookOptionEvent extends GwtEvent<ShowFacebookOptionHandler> {

  public static final GwtEvent.Type<ShowFacebookOptionHandler> TYPE = new GwtEvent.Type<ShowFacebookOptionHandler>();

  public static enum Type {
    PROFILE, FRIENDS, NEWS_FEED, GAMES
  }

  private Type type;

  public ShowFacebookOptionEvent(Type type) {
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  @Override
  protected void dispatch(ShowFacebookOptionHandler handler) {
    handler.onExecute(this);
  }

  @Override
  public GwtEvent.Type<ShowFacebookOptionHandler> getAssociatedType() {
    return TYPE;
  }

}
