package ca.by.project_x.service;

import java.util.Map;

/**
 * Key-value storage service.
 */
public interface IKeyValueStorageService<K, V> {
	//TODO: we can use it as package sample service interface. And this structure might be useful, worth to keep as draft
	//TODO: delete if it's still not used after project become messy enough 

    V get(K key);

    V put(K key, V value);

    void putAll(Map<? extends K, ? extends V> m);

    V remove(K key);

}
