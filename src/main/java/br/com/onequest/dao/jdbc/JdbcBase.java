package br.com.onequest.dao.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import br.com.onequest.dao.DAOBase;

public abstract class JdbcBase<T> extends JdbcDaoSupport implements DAOBase<T> {


}
