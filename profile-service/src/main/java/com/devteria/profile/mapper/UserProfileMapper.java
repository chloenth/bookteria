package com.devteria.profile.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.devteria.profile.dto.ProfileCreationRequest;
import com.devteria.profile.entity.UserProfile;
import com.devteria.profile.response.UserProfileResponse;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "userId", ignore = true)
    UserProfile toUserProfile(ProfileCreationRequest request);

    UserProfileResponse toUserProfileResponse(UserProfile entity);
}
