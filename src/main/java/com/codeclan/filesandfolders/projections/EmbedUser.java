package com.codeclan.filesandfolders.projections;

import com.codeclan.filesandfolders.models.Folder;
import com.codeclan.filesandfolders.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {

    String getTitle();
    User getUser();

}
