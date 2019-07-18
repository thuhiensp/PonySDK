/*
 * Copyright 2019 SmartTrade Technologies
 *     Pony SDK
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
package com.ponysdk.core.ui2.mediasession;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;

public class PMediaMetadata extends PObject2 {
    private static final Logger log = LoggerFactory.getLogger(PMediaMetadata.class);
     private String title;
     private String artist;
     private String album;
     private PMediaImage[] artwork;

    public PMediaMetadata() {
      applyInit(widgetNoArgs());
    }


    public PMediaMetadata(PMediaMetadataInit metadata){
      applyInit(widgetWithArgs(), new Object[]{metadata});
    }


    public void setTitle(final String title)  {
       if (Objects.equals(this.title, title))return;
       this.title = title;
       log.info("title" + title);
       saveUpdateAttribute(PAttributeNames.TITLE,title);
    }
    public void setArtist(final String artist)  {
       if (Objects.equals(this.artist, artist))return;
       this.artist = artist;
       log.info("artist" + artist);
       saveUpdateAttribute(PAttributeNames.ARTIST,artist);
    }
    public void setAlbum(final String album)  {
       if (Objects.equals(this.album, album))return;
       this.album = album;
       log.info("album" + album);
       saveUpdateAttribute(PAttributeNames.ALBUM,album);
    }
    public void setArtwork(final PMediaImage[] artwork)  {
       if (Objects.equals(this.artwork, artwork))return;
       this.artwork = artwork;
       log.info("artwork" + artwork);
       saveUpdateAttribute(PAttributeNames.ARTWORK,artwork);
    }

    public String getTitle(){
      return title;
    }
    public String getArtist(){
      return artist;
    }
    public String getAlbum(){
      return album;
    }
    public PMediaImage[] getArtwork(){
      return artwork;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.MEDIA_METADATA;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.MEDIA_METADATA;
    }


}