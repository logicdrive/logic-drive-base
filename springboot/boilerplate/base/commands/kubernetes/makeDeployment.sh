K8S_IMAGE_NAME=`cat ./commands/kubernetes/values/k8s_image_name.txt`
K8S_IMAGE_USERNAME=`cat ./commands/kubernetes/values/k8s_image_username.txt`
K8S_IMAGE_VERSION=`cat ./commands/kubernetes/values/k8s_image_version.txt`
K8S_PORT=`cat ./commands/kubernetes/values/k8s_port.txt`
K8S_SERVICE_NAME=`cat ./commands/kubernetes/values/k8s_service_name.txt`
K8S_TARGET_PORT=`cat ./commands/kubernetes/values/k8s_target_port.txt`

sed "s/\$k8s_image/$K8S_IMAGE_USERNAME\/$K8S_IMAGE_NAME:$K8S_IMAGE_VERSION/g" ./kubernetes/deployment.yaml |\
sed "s/\$k8s_port/$K8S_PORT/g" |\
sed "s/\$k8s_service_name/$K8S_SERVICE_NAME/g" |\
sed "s/\$k8s_target_port/$K8S_TARGET_PORT/g" |\
kubectl apply -f -