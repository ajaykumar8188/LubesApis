package com.lubes.lubesbackend.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.lubes.lubesbackend.dao.LubesDao;
import com.lubes.lubesbackend.model.roles;

@Repository
public class LubesDaoImpl implements LubesDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Value("${database.name}")
	private String Schema;
	

	@Override
	public Object GetRoles() {
		List<roles> Result = new ArrayList<roles>();

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName(Schema)

				.withProcedureName("GetRoles");

		Map<String, Object> inParamMap = new HashMap<String, Object>();
		SqlParameterSource in = new MapSqlParameterSource(inParamMap);

		Map<String, Object> resultData = simpleJdbcCall.execute(in);

		for (Entry<String, Object> e : resultData.entrySet()) {
			String key = e.getKey();
			System.out.println(key);
			if (e.getValue() instanceof List) {
				List obj = (List) e.getValue();
				if ("#result-set-1".equals(e.getKey())) {
					for (int i = 0; i < obj.size(); i++) {
						roles c = new roles();
						
						Map map = (Map) obj.get(i);
						c.setId((Integer) map.get("Id"));
						c.setName((String) map.get("Name"));
						c.setDescrption((String) map.get("Description"));
						
						Result.add(c);

					}
				}

			}
		}
		return Result;
	}

}
