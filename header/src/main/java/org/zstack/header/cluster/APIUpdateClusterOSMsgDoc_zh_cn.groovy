package org.zstack.header.cluster

import org.zstack.header.cluster.APIUpdateClusterOSEvent

doc {
    title "UpdateClusterOS"

    category "cluster"

    desc """升级集群内物理机的操作系统"""

    rest {
        request {
			url "PUT /v1/clusters/{uuid}/actions"


            header(Authorization: 'OAuth the-session-uuid')

            clz APIUpdateClusterOSMsg.class

            desc """升级集群内物理机的操作系统"""
            
			params {

				column {
					name "uuid"
					enclosedIn "updateClusterOS"
					desc "资源的UUID，唯一标示该资源"
					location "url"
					type "String"
					optional false
					since "2.3"
					
				}
				column {
					name "systemTags"
					enclosedIn ""
					desc "系统标签"
					location "body"
					type "List"
					optional true
					since "2.3"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc "用户标签"
					location "body"
					type "List"
					optional true
					since "2.3"
					
				}
			}
        }

        response {
            clz APIUpdateClusterOSEvent.class
        }
    }
}
