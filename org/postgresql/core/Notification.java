package org.postgresql.core;


/* $Header$
 * This is the implementation of the PGNotification interface
 */
public class Notification implements org.postgresql.PGNotification
{
    public Notification(String p_name, int p_pid) {
	m_name = p_name;
        m_pid = p_pid;
    }

    /* 
     * Returns name of this notification
     */
    public String getName() {
        return m_name;
    }

    /*
     * Returns the process id of the backend process making this notification
     */
    public int getPID() {
	return m_pid;
    }

    private String m_name;
    private int m_pid;

}
