package dao;

import java.sql.SQLException;
import java.util.List;

/**
 * General DAO interface.
 *
 * @param <V> type of stored entity (VALUE).
 * @param <ID> type of id (KEY) field of stored entity.
 *
 * @author Peretiatko Volodymyr
 * @version 0.1
 */
public interface IDao <V,ID> {

        /**
         * Creates new entity instance (stores it to DB).
         *
         * @param entity new instance, which will be stored.
         * @return stored variant of instance (with assigned ID field), if operation
         * was successful, or null, if it wasn't.
         */
        V create(V entity) throws SQLException;

        /**
         * Searches for all stored entity instances.
         *
         * @return List of stored instances, if operation was successful, or null,
         * if it wasn't.
         */
        List<V> findAll();

        /**
         * Searches for stored entity instance by its ID.
         *
         * @param id target instance's ID (key).
         * @return needed instance, if operation was successful, or null,
         * if it wasn't or if such instance was not stored to DB.
         */
        V find(ID id);

        /**
         * Removes from DB stored entity instance by its ID.
         *
         * @param id target instance's ID (key).
         * @return removed instance, if operation was successful, or null,
         * if it wasn't or if such instance was not stored to DB.
         */
        V remove(ID id);


}
