package com.codeclan.filesandfolders.projections;

import com.codeclan.filesandfolders.models.File;
import com.codeclan.filesandfolders.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {

    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();

}
