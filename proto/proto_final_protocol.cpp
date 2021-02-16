// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.6.0.0

#if defined(_MSC_VER)
#pragma warning(push)
#pragma warning(disable:4065) // C4065: switch statement contains 'default' but no 'case' labels
#endif

#include "proto_final_protocol.h"

namespace FBE {

namespace proto {

size_t FinalSender::send(const ::proto::OrderMessage& value)
{
    // Serialize the value into the FBE stream
    size_t serialized = OrderMessageModel.serialize(value);
    assert((serialized > 0) && "proto::OrderMessage serialization failed!");
    assert(OrderMessageModel.verify() && "proto::OrderMessage validation failed!");

    // Log the value
    if (this->_logging)
    {
        std::string message = value.string();
        this->onSendLog(message);
    }

    // Send the serialized value
    return this->send_serialized(serialized);
}

size_t FinalSender::send(const ::proto::BalanceMessage& value)
{
    // Serialize the value into the FBE stream
    size_t serialized = BalanceMessageModel.serialize(value);
    assert((serialized > 0) && "proto::BalanceMessage serialization failed!");
    assert(BalanceMessageModel.verify() && "proto::BalanceMessage validation failed!");

    // Log the value
    if (this->_logging)
    {
        std::string message = value.string();
        this->onSendLog(message);
    }

    // Send the serialized value
    return this->send_serialized(serialized);
}

size_t FinalSender::send(const ::proto::AccountMessage& value)
{
    // Serialize the value into the FBE stream
    size_t serialized = AccountMessageModel.serialize(value);
    assert((serialized > 0) && "proto::AccountMessage serialization failed!");
    assert(AccountMessageModel.verify() && "proto::AccountMessage validation failed!");

    // Log the value
    if (this->_logging)
    {
        std::string message = value.string();
        this->onSendLog(message);
    }

    // Send the serialized value
    return this->send_serialized(serialized);
}

bool FinalReceiver::onReceive(size_t type, const void* data, size_t size)
{
    switch (type)
    {
        case FBE::proto::OrderMessageFinalModel::fbe_type():
        {
            // Deserialize the value from the FBE stream
            OrderMessageModel.attach(data, size);
            assert(OrderMessageModel.verify() && "proto::OrderMessage validation failed!");
            [[maybe_unused]] size_t deserialized = OrderMessageModel.deserialize(OrderMessageValue);
            assert((deserialized > 0) && "proto::OrderMessage deserialization failed!");

            // Log the value
            if (this->_logging)
            {
                std::string message = OrderMessageValue.string();
                this->onReceiveLog(message);
            }

            // Call receive handler with deserialized value
            onReceive(OrderMessageValue);
            return true;
        }
        case FBE::proto::BalanceMessageFinalModel::fbe_type():
        {
            // Deserialize the value from the FBE stream
            BalanceMessageModel.attach(data, size);
            assert(BalanceMessageModel.verify() && "proto::BalanceMessage validation failed!");
            [[maybe_unused]] size_t deserialized = BalanceMessageModel.deserialize(BalanceMessageValue);
            assert((deserialized > 0) && "proto::BalanceMessage deserialization failed!");

            // Log the value
            if (this->_logging)
            {
                std::string message = BalanceMessageValue.string();
                this->onReceiveLog(message);
            }

            // Call receive handler with deserialized value
            onReceive(BalanceMessageValue);
            return true;
        }
        case FBE::proto::AccountMessageFinalModel::fbe_type():
        {
            // Deserialize the value from the FBE stream
            AccountMessageModel.attach(data, size);
            assert(AccountMessageModel.verify() && "proto::AccountMessage validation failed!");
            [[maybe_unused]] size_t deserialized = AccountMessageModel.deserialize(AccountMessageValue);
            assert((deserialized > 0) && "proto::AccountMessage deserialization failed!");

            // Log the value
            if (this->_logging)
            {
                std::string message = AccountMessageValue.string();
                this->onReceiveLog(message);
            }

            // Call receive handler with deserialized value
            onReceive(AccountMessageValue);
            return true;
        }
        default: break;
    }

    return false;
}

void FinalClient::reset_requests()
{
    Sender::reset();
    Receiver::reset();
}

void FinalClient::watchdog_requests(uint64_t utc)
{
}

} // namespace proto

} // namespace FBE

#if defined(_MSC_VER)
#pragma warning(pop)
#endif
