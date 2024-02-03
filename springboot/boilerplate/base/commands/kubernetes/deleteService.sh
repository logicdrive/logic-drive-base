K8S_SERVICE_NAME=`cat ./commands/kubernetes/values/k8s_service_name.txt`

kubectl delete service/$K8S_SERVICE_NAME