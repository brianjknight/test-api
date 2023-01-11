## Notes for servers.json file
{
    "Servers": {
        "1": {
# name of the pgTestServer we built
            "Name": "pgserver1",

# usually a hierchical name
            "Group": "Dev",
            
# port in the container it will run on
            "Port": 5432,
# env variable we set
            "Username": "docker",

            "Password": "docker",
# keep it same as the name here
            "Host": "pgserver1",
# for SSL certificate
            "SSLMode:": "prefer",
# normally just called postgres
            "MaintenanceDB": "postgres"

        }
    }
}