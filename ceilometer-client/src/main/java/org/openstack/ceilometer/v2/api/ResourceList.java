package org.openstack.ceilometer.v2.api;

import java.util.List;

import org.openstack.base.client.OpenStackRequest;
import org.openstack.ceilometer.QueriableCeilometerCommand;
import org.openstack.ceilometer.v2.model.Resource;

public class ResourceList extends QueriableCeilometerCommand<ResourceList, List<Resource>> {
	
	public ResourceList() {
		OpenStackRequest request = new OpenStackRequest();
		//return query(target.path("resources")).request(MediaType.APPLICATION_JSON).get(new GenericType<List<Resource>>() {});
	}

}