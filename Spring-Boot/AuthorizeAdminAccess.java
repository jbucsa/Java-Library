// The following code will authorize the admin to access the dashboard.  The following code will implement Spring Security and provide the required authorization to access the dashboard.

@Override 
protected void configure(HttpSecurity http) throws Exception{
    http.authorizeRequests();
        antMatches("/dashboard").hasRole("ADMIN");
}
