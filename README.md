# Sample 2 auth0
## Tech Stack
* Spring Security
* auth0-spring-security-api

## Step1
* Update Audience and Issuer in com.core.Auth0SecConfig

## Step2
* Generate application_url (eg: https://webcome.auth0.com/oauth/token) client_id and client_secret from your auth0 dashboard

## Step3

```
curl --request POST --url {application_url} --header 'content-type: application/json' --data '{"client_id":"{from your dashboard}","client_secret":"{from your dashboard}","audience":"http://localhost:8080/auth0eg","grant_type":"client_credentials"}' ```

* copy the access_token from the response


## Step4
curl -X GET -H "Authorization: Bearer {access_toke}" -H "Cache-Control: no-cache" "http://localhost:8080/sapi/home/1"

* you will see a response something like the following:

```{"id":"NDI0QzE2NTRDNjFDN0ZBNTg1NkZEREYzQzBFQTk4OTMyOEEwRjMwOQ","name":"rNcheFq0z9Y1Wi8pXa1iNE1igsGrx1wY@clients","token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6Ik5ESTBRekUyTlRSRE5qRkROMFpCTlRnMU5rWkVSRVl6UXpCRlFUazRPVE15T0VFd1JqTXdPUSJ9.eyJpc3MiOiJodHRwczovL3dlYmNvbWUuYXV0aDAuY29tLyIsInN1YiI6InJOY2hlRnEwejlZMVdpOHBYYTFpTkUxaWdzR3J4MXdZQGNsaWVudHMiLCJhdWQiOiJodHRwOi8vbG9jYWxob3N0OjgwODAvYXV0aDBlZyIsImlhdCI6MTUxNzQyNjE5MCwiZXhwIjoxNTE3NTEyNTkwLCJhenAiOiJyTmNoZUZxMHo5WTFXaThwWGExaU5FMWlnc0dyeDF3WSIsImd0eSI6ImNsaWVudC1jcmVkZW50aWFscyJ9.Pbhu3Hs_dyRll6yQbecF3p3UhUlavXrdv-jGB8PXj9IUUBWLhl6F3xVcBt7oICe9PYHagr3JFwPBuEHDalVWdgp8XnecAJK6023Ee0Bv5kz8XOroCL3YY91tVdlMSpFrE7quBqfR2CXd7u_FhCsda0j5OhmryQqWuxmQSqHvq6NEbNJ6k_AoSCF_IFcAV0s7-GyrWR_kJZsP8yk2e-dw2ExH7M7ksFVZhdotzD2Fi8DX1zPIUcUJDU4KkcG0se7QfelmFMqmIDGOUhhh1b7ADCOgI8nQIbYaaFC9fhktvBzZVGQwoA4mzUY8lL9pMmNQksRLWVc915pwml11J-RUCg"}```

