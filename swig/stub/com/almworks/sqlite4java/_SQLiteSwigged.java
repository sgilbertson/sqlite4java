/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.almworks.sqlite4java;

class _SQLiteSwigged {
  public static int sqlite3_initialize() {
    return _SQLiteSwiggedJNI.sqlite3_initialize();
  }

  public static int sqlite3_shutdown() {
    return _SQLiteSwiggedJNI.sqlite3_shutdown();
  }

  public static int sqlite3_extended_errcode(SWIGTYPE_p_sqlite3 db) {
    return _SQLiteSwiggedJNI.sqlite3_extended_errcode(SWIGTYPE_p_sqlite3.getCPtr(db));
  }

  public static String sqlite3_libversion() {
    return _SQLiteSwiggedJNI.sqlite3_libversion();
  }

  public static String sqlite3_sourceid() {
    return _SQLiteSwiggedJNI.sqlite3_sourceid();
  }

  public static int sqlite3_libversion_number() {
    return _SQLiteSwiggedJNI.sqlite3_libversion_number();
  }

  public static int sqlite3_compileoption_used(String zOptName) {
    return _SQLiteSwiggedJNI.sqlite3_compileoption_used(zOptName);
  }

  public static String sqlite3_compileoption_get(int N) {
    return _SQLiteSwiggedJNI.sqlite3_compileoption_get(N);
  }

  public static int sqlite3_threadsafe() {
    return _SQLiteSwiggedJNI.sqlite3_threadsafe();
  }

  public static int sqlite3_close(SWIGTYPE_p_sqlite3 arg0) {
    return _SQLiteSwiggedJNI.sqlite3_close(SWIGTYPE_p_sqlite3.getCPtr(arg0));
  }

  public static int sqlite3_extended_result_codes(SWIGTYPE_p_sqlite3 arg0, int onoff) {
    return _SQLiteSwiggedJNI.sqlite3_extended_result_codes(SWIGTYPE_p_sqlite3.getCPtr(arg0), onoff);
  }

  public static long sqlite3_last_insert_rowid(SWIGTYPE_p_sqlite3 arg0) {
    return _SQLiteSwiggedJNI.sqlite3_last_insert_rowid(SWIGTYPE_p_sqlite3.getCPtr(arg0));
  }

  public static int sqlite3_changes(SWIGTYPE_p_sqlite3 arg0) {
    return _SQLiteSwiggedJNI.sqlite3_changes(SWIGTYPE_p_sqlite3.getCPtr(arg0));
  }

  public static int sqlite3_total_changes(SWIGTYPE_p_sqlite3 arg0) {
    return _SQLiteSwiggedJNI.sqlite3_total_changes(SWIGTYPE_p_sqlite3.getCPtr(arg0));
  }

  public static void sqlite3_interrupt(SWIGTYPE_p_sqlite3 arg0) {
    _SQLiteSwiggedJNI.sqlite3_interrupt(SWIGTYPE_p_sqlite3.getCPtr(arg0));
  }

  public static int sqlite3_complete(String sql) {
    return _SQLiteSwiggedJNI.sqlite3_complete(sql);
  }

  public static int sqlite3_busy_timeout(SWIGTYPE_p_sqlite3 arg0, int ms) {
    return _SQLiteSwiggedJNI.sqlite3_busy_timeout(SWIGTYPE_p_sqlite3.getCPtr(arg0), ms);
  }

  public static long sqlite3_memory_used() {
    return _SQLiteSwiggedJNI.sqlite3_memory_used();
  }

  public static long sqlite3_memory_highwater(int resetFlag) {
    return _SQLiteSwiggedJNI.sqlite3_memory_highwater(resetFlag);
  }

  public static int sqlite3_errcode(SWIGTYPE_p_sqlite3 db) {
    return _SQLiteSwiggedJNI.sqlite3_errcode(SWIGTYPE_p_sqlite3.getCPtr(db));
  }

  public static String sqlite3_errmsg(SWIGTYPE_p_sqlite3 arg0) {
    return _SQLiteSwiggedJNI.sqlite3_errmsg(SWIGTYPE_p_sqlite3.getCPtr(arg0));
  }

  public static int sqlite3_bind_double(SWIGTYPE_p_sqlite3_stmt arg0, int arg1, double arg2) {
    return _SQLiteSwiggedJNI.sqlite3_bind_double(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), arg1, arg2);
  }

  public static int sqlite3_bind_int(SWIGTYPE_p_sqlite3_stmt arg0, int arg1, int arg2) {
    return _SQLiteSwiggedJNI.sqlite3_bind_int(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), arg1, arg2);
  }

  public static int sqlite3_bind_int64(SWIGTYPE_p_sqlite3_stmt arg0, int arg1, long arg2) {
    return _SQLiteSwiggedJNI.sqlite3_bind_int64(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), arg1, arg2);
  }

  public static int sqlite3_bind_null(SWIGTYPE_p_sqlite3_stmt arg0, int arg1) {
    return _SQLiteSwiggedJNI.sqlite3_bind_null(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), arg1);
  }

  public static int sqlite3_bind_zeroblob(SWIGTYPE_p_sqlite3_stmt arg0, int arg1, int n) {
    return _SQLiteSwiggedJNI.sqlite3_bind_zeroblob(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), arg1, n);
  }

  public static int sqlite3_bind_parameter_count(SWIGTYPE_p_sqlite3_stmt arg0) {
    return _SQLiteSwiggedJNI.sqlite3_bind_parameter_count(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0));
  }

  public static String sqlite3_bind_parameter_name(SWIGTYPE_p_sqlite3_stmt arg0, int arg1) {
    return _SQLiteSwiggedJNI.sqlite3_bind_parameter_name(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), arg1);
  }

  public static int sqlite3_bind_parameter_index(SWIGTYPE_p_sqlite3_stmt arg0, String zName) {
    return _SQLiteSwiggedJNI.sqlite3_bind_parameter_index(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), zName);
  }

  public static int sqlite3_clear_bindings(SWIGTYPE_p_sqlite3_stmt arg0) {
    return _SQLiteSwiggedJNI.sqlite3_clear_bindings(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0));
  }

  public static int sqlite3_column_count(SWIGTYPE_p_sqlite3_stmt pStmt) {
    return _SQLiteSwiggedJNI.sqlite3_column_count(SWIGTYPE_p_sqlite3_stmt.getCPtr(pStmt));
  }

  public static String sqlite3_column_name(SWIGTYPE_p_sqlite3_stmt arg0, int N) {
    return _SQLiteSwiggedJNI.sqlite3_column_name(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), N);
  }

  public static String sqlite3_column_database_name(SWIGTYPE_p_sqlite3_stmt arg0, int arg1) {
    return _SQLiteSwiggedJNI.sqlite3_column_database_name(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), arg1);
  }

  public static String sqlite3_column_table_name(SWIGTYPE_p_sqlite3_stmt arg0, int arg1) {
    return _SQLiteSwiggedJNI.sqlite3_column_table_name(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), arg1);
  }

  public static String sqlite3_column_origin_name(SWIGTYPE_p_sqlite3_stmt arg0, int arg1) {
    return _SQLiteSwiggedJNI.sqlite3_column_origin_name(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), arg1);
  }

  public static String sqlite3_column_decltype(SWIGTYPE_p_sqlite3_stmt arg0, int i) {
    return _SQLiteSwiggedJNI.sqlite3_column_decltype(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), i);
  }

  public static int sqlite3_step(SWIGTYPE_p_sqlite3_stmt arg0) {
    return _SQLiteSwiggedJNI.sqlite3_step(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0));
  }

  public static int sqlite3_data_count(SWIGTYPE_p_sqlite3_stmt pStmt) {
    return _SQLiteSwiggedJNI.sqlite3_data_count(SWIGTYPE_p_sqlite3_stmt.getCPtr(pStmt));
  }

  public static double sqlite3_column_double(SWIGTYPE_p_sqlite3_stmt arg0, int iCol) {
    return _SQLiteSwiggedJNI.sqlite3_column_double(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), iCol);
  }

  public static int sqlite3_column_int(SWIGTYPE_p_sqlite3_stmt arg0, int iCol) {
    return _SQLiteSwiggedJNI.sqlite3_column_int(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), iCol);
  }

  public static long sqlite3_column_int64(SWIGTYPE_p_sqlite3_stmt arg0, int iCol) {
    return _SQLiteSwiggedJNI.sqlite3_column_int64(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), iCol);
  }

  public static int sqlite3_column_type(SWIGTYPE_p_sqlite3_stmt arg0, int iCol) {
    return _SQLiteSwiggedJNI.sqlite3_column_type(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0), iCol);
  }

  public static int sqlite3_finalize(SWIGTYPE_p_sqlite3_stmt pStmt) {
    return _SQLiteSwiggedJNI.sqlite3_finalize(SWIGTYPE_p_sqlite3_stmt.getCPtr(pStmt));
  }

  public static int sqlite3_reset(SWIGTYPE_p_sqlite3_stmt pStmt) {
    return _SQLiteSwiggedJNI.sqlite3_reset(SWIGTYPE_p_sqlite3_stmt.getCPtr(pStmt));
  }

  public static int sqlite3_get_autocommit(SWIGTYPE_p_sqlite3 arg0) {
    return _SQLiteSwiggedJNI.sqlite3_get_autocommit(SWIGTYPE_p_sqlite3.getCPtr(arg0));
  }

  public static SWIGTYPE_p_sqlite3 sqlite3_db_handle(SWIGTYPE_p_sqlite3_stmt arg0) {
    long cPtr = _SQLiteSwiggedJNI.sqlite3_db_handle(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0));
    return (cPtr == 0) ? null : new SWIGTYPE_p_sqlite3(cPtr, false);
  }

  public static int sqlite3_enable_shared_cache(int arg0) {
    return _SQLiteSwiggedJNI.sqlite3_enable_shared_cache(arg0);
  }

  public static int sqlite3_release_memory(int arg0) {
    return _SQLiteSwiggedJNI.sqlite3_release_memory(arg0);
  }

  public static long sqlite3_soft_heap_limit64(long arg0) {
    return _SQLiteSwiggedJNI.sqlite3_soft_heap_limit64(arg0);
  }

  public static int sqlite3_blob_close(SWIGTYPE_p_sqlite3_blob arg0) {
    return _SQLiteSwiggedJNI.sqlite3_blob_close(SWIGTYPE_p_sqlite3_blob.getCPtr(arg0));
  }

  public static int sqlite3_blob_bytes(SWIGTYPE_p_sqlite3_blob arg0) {
    return _SQLiteSwiggedJNI.sqlite3_blob_bytes(SWIGTYPE_p_sqlite3_blob.getCPtr(arg0));
  }

  public static int sqlite3_stmt_readonly(SWIGTYPE_p_sqlite3_stmt arg0) {
    return _SQLiteSwiggedJNI.sqlite3_stmt_readonly(SWIGTYPE_p_sqlite3_stmt.getCPtr(arg0));
  }

  public static int sqlite3_blob_reopen(SWIGTYPE_p_sqlite3_blob arg0, long arg1) {
    return _SQLiteSwiggedJNI.sqlite3_blob_reopen(SWIGTYPE_p_sqlite3_blob.getCPtr(arg0), arg1);
  }

  public static SWIGTYPE_p_sqlite3_backup sqlite3_backup_init(SWIGTYPE_p_sqlite3 arg0, String arg1, SWIGTYPE_p_sqlite3 arg2, String arg3) {
    long cPtr = _SQLiteSwiggedJNI.sqlite3_backup_init(SWIGTYPE_p_sqlite3.getCPtr(arg0), arg1, SWIGTYPE_p_sqlite3.getCPtr(arg2), arg3);
    return (cPtr == 0) ? null : new SWIGTYPE_p_sqlite3_backup(cPtr, false);
  }

  public static int sqlite3_backup_step(SWIGTYPE_p_sqlite3_backup p, int nPage) {
    return _SQLiteSwiggedJNI.sqlite3_backup_step(SWIGTYPE_p_sqlite3_backup.getCPtr(p), nPage);
  }

  public static int sqlite3_backup_finish(SWIGTYPE_p_sqlite3_backup p) {
    return _SQLiteSwiggedJNI.sqlite3_backup_finish(SWIGTYPE_p_sqlite3_backup.getCPtr(p));
  }

  public static int sqlite3_backup_remaining(SWIGTYPE_p_sqlite3_backup p) {
    return _SQLiteSwiggedJNI.sqlite3_backup_remaining(SWIGTYPE_p_sqlite3_backup.getCPtr(p));
  }

  public static int sqlite3_backup_pagecount(SWIGTYPE_p_sqlite3_backup p) {
    return _SQLiteSwiggedJNI.sqlite3_backup_pagecount(SWIGTYPE_p_sqlite3_backup.getCPtr(p));
  }

  public static int sqlite3_enable_load_extension(SWIGTYPE_p_sqlite3 db, int onoff) {
    return _SQLiteSwiggedJNI.sqlite3_enable_load_extension(SWIGTYPE_p_sqlite3.getCPtr(db), onoff);
  }

  public static int sqlite3_load_extension(SWIGTYPE_p_sqlite3 db, String zFile, String zProc, String[] SQLITE3_STRING_OUT) {
    return _SQLiteSwiggedJNI.sqlite3_load_extension(SWIGTYPE_p_sqlite3.getCPtr(db), zFile, zProc, SQLITE3_STRING_OUT);
  }

}
