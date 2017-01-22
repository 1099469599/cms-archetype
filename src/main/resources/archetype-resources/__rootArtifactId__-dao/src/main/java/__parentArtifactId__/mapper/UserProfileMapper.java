#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${parentArtifactId}.mapper;

import ${package}.${parentArtifactId}.model.vo.UserProfile;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileMapper extends MyMapper<UserProfile> {
}